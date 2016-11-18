package fr.gagoi.pwal.utils;

public class Vec3D {

	private double[] val;

	public Vec3D() {
		val = new double[] { 0, 0, 0 };
	}

	public Vec3D(double x, double y, double z) {
		val = new double[] { x, y, z };
	}

	public double[] getValues() {
		return val;
	}

	public double getValue(int i) {
		if (i > 2)
			return 0;
		return val[i];
	}
}
