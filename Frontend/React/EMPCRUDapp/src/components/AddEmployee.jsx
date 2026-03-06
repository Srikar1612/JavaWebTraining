import { useState } from "react";
import { useNavigate } from "react-router-dom";
import EmployeeService from "../Services/EmployeeService";

function AddEmployee() {
    const [employee, setEmployee] = useState({
        firstName: ``,
        lastName: ``,
        email: ``
    });

    const navigate = useNavigate();

    const handleChange = (e) => {
        const { name, value } = e.target;
        setEmployee(prev => ({ ...prev, [name]: value }));
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        EmployeeService.createEmployee(employee)
            .then(() => navigate(`/`))
            .catch(error => console.error(`Error adding Employee`))
    };

    return (
        <div className="container">
            <h2>Add Employee</h2>
            <form onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label className="form-label">First Name</label>
                    <input
                        type="text"
                        className="form-control"
                        name="firstName"
                        value={employee.firstName}
                        onChange={handleChange}
                        required
                    />
                </div>
                <div className="mb-3">
                    <label className="form-label">Last Name</label>
                    <input
                        type="text"
                        className="form-control"
                        name="lastName"
                        value={employee.lastName}
                        onChange={handleChange}
                        required
                    />
                </div>
                <div className="mb-3">
                    <label className="form-label">Email</label>
                    <input
                        type="text"
                        className="form-control"
                        name="email"
                        value={employee.email}
                        onChange={handleChange}
                        required
                    />
                </div>
                <button type="submit" className="btn btn-primary">Submit</button>
            </form>
        </div>

    )

}

export default AddEmployee;