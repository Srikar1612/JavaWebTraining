import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import EmployeeService from "../Services/EmployeeService";

function EmployeeList() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    loadEmployees();
  }, []);

  const loadEmployees = () => {
    EmployeeService.getAllEmployees()
      .then((response) => setEmployees(response.data))
      .catch((error) =>
        console.error(`Error loading employees: ${error}`)
      );
  };

  const deleteEmployee = (id) => {
    EmployeeService.deleteEmployee(id)
      .then(() => loadEmployees())
      .catch((error) =>
        console.error(`Error deleting employee: ${error}`)
      );
  };

  return (
    <div className="container">
      <h2>Employee List</h2>

      <Link to="/add" className="btn btn-primary mb-3">
        Add Employee
      </Link>

      <table className="table table-striped">
        <thead>
          <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Actions</th>
          </tr>
        </thead>

        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.firstName}</td>
              <td>{employee.lastName}</td>
              <td>{employee.email}</td>
              <td>
                <Link
                  to={`/edit/${employee.id}`}
                  className="btn btn-info me-2"
                >
                  Edit
                </Link>

                <button
                  onClick={() => deleteEmployee(employee.id)}
                  className="btn btn-danger"
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default EmployeeList;
