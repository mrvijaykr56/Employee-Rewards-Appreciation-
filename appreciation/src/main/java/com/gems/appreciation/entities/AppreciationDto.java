package com.gems.appreciation.entities;

public class AppreciationDto {

	public class Appreciation {
	    private Long id;
	    private Long nominatorEmployeeId;
	    private Long nomineeEmployeeId;
	    private String appreciationText;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getNominatorEmployeeId() {
			return nominatorEmployeeId;
		}
		public void setNominatorEmployeeId(Long nominatorEmployeeId) {
			this.nominatorEmployeeId = nominatorEmployeeId;
		}
		public Long getNomineeEmployeeId() {
			return nomineeEmployeeId;
		}
		public void setNomineeEmployeeId(Long nomineeEmployeeId) {
			this.nomineeEmployeeId = nomineeEmployeeId;
		}
		public String getAppreciationText() {
			return appreciationText;
		}
		public void setAppreciationText(String appreciationText) {
			this.appreciationText = appreciationText;
		}
		public Appreciation(Long id, Long nominatorEmployeeId, Long nomineeEmployeeId, String appreciationText) {
			super();
			this.id = id;
			this.nominatorEmployeeId = nominatorEmployeeId;
			this.nomineeEmployeeId = nomineeEmployeeId;
			this.appreciationText = appreciationText;
		}

	    // Getters and Setters
		public Appreciation() {
			
		}
	}
	
}
