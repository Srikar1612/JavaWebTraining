var skills2 = ["HTML", "CSS", "JavaScript", "React", "Node.js"];
console.log("Original Array: " + skills2);
var lastElement = skills2.pop();
console.log("After removing last element ".concat(skills2));
var fistElement = skills2.shift();
console.log("After removing first element ".concat(skills2));
skills2.slice(1, 2);
console.log("After removing 2 elements starting from index 1: ".concat(skills2));
var skills3 = ["HTML", "CSS", "JavaScript", "React", "Node.js"];
skills3.length = 7;
console.log("Array after increasing length ".concat(skills3));
skills3.length = 2;
console.log("Array after deccreasing length ".concat(skills3));
var skills4 = ["HTML", "CSS", "JavaScript", "React"];
skills4.forEach(function print(elements) {
    console.log(elements);
});
