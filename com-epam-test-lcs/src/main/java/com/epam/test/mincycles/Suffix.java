package com.epam.test.mincycles;

public class Suffix implements Comparable {
	private int position;
	private String suffix;

	public int compareTo(Object obj) {
		Suffix suff = (Suffix) obj;
		return this.suffix.compareTo(suff.suffix);
	}

	public Suffix(String suffix) {
		this.suffix = suffix;
	}

	public Suffix(String suffix, int position) {
		this.position = position;
		this.suffix = suffix;
	}

	public int getPosition() {
		return position;
	}

	public String getSuffix() {
		return suffix;
	}

	@Override
	public String toString() {
		return "Suffix [suffix=" + suffix + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + position;
		result = prime * result + ((suffix == null) ? 0 : suffix.hashCode());
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
		Suffix other = (Suffix) obj;
		if (position != other.position)
			return false;
		if (suffix == null) {
			if (other.suffix != null)
				return false;
		} else if (!suffix.equals(other.suffix))
			return false;
		return true;
	}

}
