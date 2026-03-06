const pending: boolean = true;
const notPending: boolean = false;

const hasError: boolean = false;
const hasCompleted: boolean = true;

let result1 = hasCompleted && hasError;
console.log(result1);

let result2 = hasCompleted || hasError;
console.log(result2);

let skills1 = [`Problem Solving`, `Software Design`, `Programming`];

let skills2: String[] = [`Problem Solving`, `Software Design`, `Programming`];

let skills3: String[] =[];

console.log(skills2);

skills3[0]=`Problem Solving`;
skills3[1]=`Programming`;

skills3.push(`Software Design`);

console.log(skills3);