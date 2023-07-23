package com.gitOsca.ceo.domain;

public class CeoVO {
	private Long id;
	private String ceoBusinessNumber;
	private Long memberId;
	private String cafeName;
	private String cafeLocation;
	private String cafeContactEmail;
	private String cafeContactPhonenumber;

	public CeoVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCeoBusinessNumber() {
		return ceoBusinessNumber;
	}

	public void setCeoBusinessNumber(String ceoBusinessNumber) {
		this.ceoBusinessNumber = ceoBusinessNumber;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public String getCafeLocation() {
		return cafeLocation;
	}

	public void setCafeLocation(String cafeLocation) {
		this.cafeLocation = cafeLocation;
	}

	public String getCafeContactEmail() {
		return cafeContactEmail;
	}

	public void setCafeContactEmail(String cafeContactEmail) {
		this.cafeContactEmail = cafeContactEmail;
	}

	public String getCafeContactPhonenumber() {
		return cafeContactPhonenumber;
	}

	public void setCafeContactPhonenumber(String cafeContactPhonenumber) {
		this.cafeContactPhonenumber = cafeContactPhonenumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CeoVO other = (CeoVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CeoVO [id=" + id + ", ceoBusinessNumber=" + ceoBusinessNumber + ", memberId=" + memberId + ", cafeName="
				+ cafeName + ", cafeLocation=" + cafeLocation + ", cafeContactEmail=" + cafeContactEmail
				+ ", cafeContactPhonenumber=" + cafeContactPhonenumber + "]";
	}

}
