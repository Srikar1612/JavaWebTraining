interface Product {
    id: number,
    name: String,
    price: number
}

function getProduct(id:number):Product{
    return {
        id: id,
        name: `Awesome Gadget ${id}`,
        price: 99.5
    }
}

const product=getProduct(1);
console.log(`The product ${product.name} costs ${product.price}`);
console.log(typeof(product));