// Create the entire calculator UI using DOM
const container = document.getElementById("calculatorContainer");

const calculator = document.createElement("div");
calculator.className = "calculator";

const display = document.createElement("input");
display.setAttribute("type", "text");
display.setAttribute("id", "display");
display.setAttribute("readonly", true);
display.className = "form-control display mb-3";

calculator.appendChild(display);

//Button Layout
const buttons = [
    ["MC", "M+", "M-", "C"],
    ["7", "8", "9", "/"],
    ["4", "5", "6", "*"],
    ["1", "2", "3", "-"],
    ["0", "00", ".", "+"],
    ["<-", "=", "", ""]
];

buttons.forEach(row => {
    const rowDiv = document.createElement("div");
    rowDiv.className = "d-flex justify-content-between mb-2";

    row.forEach(char => { 
        const btn = document.createElement("button");
        btn.innerText = char;
        btn.className = "btn btn-outline-primary flex-fill mx-1";
        btn.onclick = () => handleButtonClick(char);
        rowDiv.appendChild(btn);
    });

    calculator.appendChild(rowDiv);
});

container.appendChild(calculator);

//Button click logic
function handleButtonClick(char){
    const disp = document.getElementById("display");
    if(char === "C"){
        disp.value = "";
    }
    else if(char === "<-"){
        disp.value = disp.value.slice(0, -1);
    }
    else if(char === "="){
        try{
            disp.value = eval(disp.value);
        } 
        catch { 
        alert("Invalid Expression");
        }
    } else if(char === "M+"){
        localStorage.setItem("memory", disp.value || "0");
    } else if(char === "M-"){
        let memory = parseFloat(localStorage.getItem("memory") || "0");
        let current = parseFloat(disp.value || "0");
        let result = memory  -current;
        localStorage.setItem("memory", result);
    } else if(char === "MC"){
        localStorage.removeItem("memory");
    } else {
        disp.value += char;
    }
}

//Keyboard input for numbers only
document.addEventListener("keydown", function(e){
    const disp = document.getElementById("display");
    const allowed = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"];
    if(allowed.includes(e.key)){
        disp.value += e.key;
    } else if (e.key === "Backspace") {
        disp.value = disp.value.slice(0, -1);
    } else {
        e.preventDefault();
        alert("Only numbers are allowed");
    }
});
