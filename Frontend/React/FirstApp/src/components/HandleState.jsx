import { useState } from 'react';

function HandleState() {
  // let count =0;
  const [count, setCount] = useState(0);
  return (
    <>
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button>
    </>
  );
  function increment() {
    setCount(prev=>prev+1);
    // console.log(count+1);
    // count++;

    const fruits = ['apple', 'banana', 'orange'];

    const [first, second, third] = fruits;
    console.log(first);
    console.log(second);
    console.log(third);
  }
}

export default HandleState