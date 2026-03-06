let message = "IBM"

let heading = document.createElement(`h1`);
heading.textContent = message;

document.body.appendChild(heading);

const newHeading = document.querySelector(`h1`);
message = "IBM Banglore";
if (newHeading !== null) {
    newHeading.textContent = message;
    document.body.append(newHeading);
}