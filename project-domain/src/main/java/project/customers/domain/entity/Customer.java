package project.customers.domain.entity;

import java.util.Set;

import project.project.domain.entity.Project;

public class Customer {
	private long id;
    private String firstName;
    private String lastName;
    private Set<Project> bankAccounts;
    private String documentNumber;
    

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Customer() {
    }

    public String getFullName() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Project> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<Project> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }



    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bankAccounts="
                + bankAccounts + ", documentNumber=" + documentNumber + "]";
    }
    
    
}
