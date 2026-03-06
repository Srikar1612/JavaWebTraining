interface Person {
    name: String,
    age: number,
    greet(): void,
    optionalProp?: String,
    readonly id: number
}

interface Employee extends Person {
    employeeId: String,
    department: String
}

interface Manager extends Person, Employee {
    teamSize: number;
}

const john: Manager = {
    name: `John`,
    age: 30,

    greet() {
        console.log(`hi i'm ${this.name}`)
    },

    id: 1,
    employeeId: "E123",
    department: "Engineering",
    teamSize: 5
}

john.greet();