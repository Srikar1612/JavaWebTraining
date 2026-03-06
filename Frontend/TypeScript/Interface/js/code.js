var john = {
    name: "John",
    age: 30,
    greet: function () {
        console.log("Hello I'm ".concat(this.name));
    },
    id: 1
};
john.greet();
