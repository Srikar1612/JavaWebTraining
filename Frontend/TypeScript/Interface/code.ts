interface Person {
    name: String,
    age: number,
    greet(): void,
    optionalProp?: String,
    readonly id: number
}

const john: Person = {
    name: `John`,
    age: 30,
    greet() {
        console.log(`Hello I'm ${this.name}`);
    },
    id: 1
};

john.greet();