var john = {
    name: "John",
    age: 30,
    greet: function () {
        console.log("hi i'm ".concat(this.name));
    },
    id: 1,
    employeeId: "E123",
    department: "Engineering",
    teamSize: 5
};
john.greet();
