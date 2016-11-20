package fr.gagoi.pwal.utils;

public class Vec2D {

	double[] val;

	public Vec2D() {
		val = new double[] { 0, 0 };
	}

	public Vec2D(double x, double y) {
		val = new double[] { x, y };
	}

	public double[] getValues() {
		return val;
	}

	public double getValue(int i) {
		if (i > 1)
			return 0;
		return val[i];
	}

	@Override
	public String toString() {
		return "Vec2D(" + getValue(0) + ";" + getValue(1) + ")";
	}
}
