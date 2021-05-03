package kampGun4_2.Entities;

import java.util.Date;

public class Customer {

		private int customerId;
		private String firstName;
		private String lastName;
		private String nationaltyId;
		private Date dateOfBirth;
		
		public Customer() {
			
		}
		
		public Customer(int customerId, String firstName, String lastName, String nationaltyId, Date dateOfBirth) {
			super();
			this.customerId = customerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationaltyId = nationaltyId;
			this.dateOfBirth = dateOfBirth;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
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

		public String getNationaltyId() {
			return nationaltyId;
		}

		public void setNationaltyId(String nationaltyId) {
			this.nationaltyId = nationaltyId;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
}
