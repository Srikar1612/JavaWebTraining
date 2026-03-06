import { useState } from "react";

function User({isLoggedIn = false}){
    const [name, setName] = useState(``);
    const [age, setAge] = useState(``);
    const [submitted, setSubmitted] = useState(false);

    const handleSubmit = () => {
        setSubmitted(true);
    };

    return (
        <>
            <label htmlFor="name">Name: <input
             type="text" 
             value={name}
             onChange={(e)=>setName(e.target.value)}
             placeholder="Enter your name"
             /></label> <br />
             <label htmlFor="age">Age: <input type="text"
              value={age}
              onChange={(e)=>setAge(e.target.value)}
              placeholder="Enter your age"
             /></label> <br />

             <button onClick={handleSubmit}>Submit</button>
             {submitted && <p>Form Submitted</p>}
        </>
    )
}

export default User