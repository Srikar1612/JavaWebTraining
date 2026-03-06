let skills2: String[]  = [`HTML`, `CSS`, `JavaScript`, `React`, `Node.js`];
console.log("Original Array: "+skills2);

let lastElement = skills2.pop();
console.log(`After removing last element ${skills2}`);

let fistElement = skills2.shift();
console.log(`After removing first element ${skills2}`);

skills2.slice(1,2);
console.log(`After removing 2 elements starting from index 1: ${skills2}`);

let skills3: String[] = [`HTML`, `CSS`, `JavaScript`, `React`, `Node.js`];
skills3.length=7;
console.log(`Array after increasing length ${skills3}`);

skills3.length=2;
console.log(`Array after deccreasing length ${skills3}`);

let skills4: String[] = [`HTML`, `CSS`, `JavaScript`, `React`];
skills4.forEach(function print(elements){
    console.log(elements);
});