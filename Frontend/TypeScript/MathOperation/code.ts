interface MathOperation {
    (num1: number, num2: number): number;
}

function process(operation: MathOperation, num1: number, num2: number) {
    console.log(operation(num1, num2));
}

let sum: MathOperation = (num1: number, num2: number) => { return num1 + num2; };

console.log(sum(2, 4));

process((num1: number, num2: number) => { return num1 * num2; }, 2, 4);