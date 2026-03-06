function f1() {
    console.group("Group 1");
    console.groupCollapsed();
    console.info("Getting Started");
    console.error("Something is wrong");
    console.log("logging this");
    console.groupEnd();
    console.info("Bye");
}
f1();
