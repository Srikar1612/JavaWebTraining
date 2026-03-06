import { useEffect, useState } from "react";
import EmployeeService from "../Services/EmployeeService";
import { Link, useParams, useNavigate } from "react-router-dom";


function EditEmployee() {
    const { id } = useParams();
    const navigate = useNavigate();
    const [employee, setEmployee] = useState({
        id: id,
        firstName: ``,
        lastName: ``,
        email: ``
    });

    useEffect(() => {
        EmployeeService.getEmployeeById(id)
            .then(response => setEmployee(response.data))
            .catch(error => console.error(`Error loading employees: `, error));
    }, [id]);

    const handleChange = (e) => {
        const { name, value } = e.target;
        setEmployee(prev => ({ ...prev, [name]: value }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        EmployeeService.updateEmployee(id, employee)
            .then(() => navigate(`/`))
            .catch(error => console.error(`Error Updating employee ${error}`));
    };

    return (
        <div className="container">
            <h2>Edit Employee</h2>
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
                <button type="submit" className="btn btn-primary">Update</button>
            </form>
        </div>


    )

}

export default EditEmployee;
