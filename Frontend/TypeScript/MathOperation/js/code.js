function process(operation, num1, num2) {
    console.log(operation(num1, num2));
}
var sum = function (num1, num2) { return num1 + num2; };
console.log(sum(2, 4));
process(function (num1, num2) { return num1 * num2; }, 2, 4);
