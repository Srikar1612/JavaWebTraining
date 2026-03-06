function getProduct(id) {
    return {
        id: id,
        name: "Awesome Gadget ".concat(id),
        price: 99.5
    };
}
var product = getProduct(1);
console.log("The product ".concat(product.name, " costs ").concat(product.price));
console.log(typeof (product));
