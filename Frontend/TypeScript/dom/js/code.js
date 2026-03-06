var message = "IBM";
var heading = document.createElement("h1");
heading.textContent = message;
document.body.appendChild(heading);
var newHeading = document.querySelector("h1");
message = "IBM Banglore";
newHeading.textContent = message;
document.body.append(newHeading);
