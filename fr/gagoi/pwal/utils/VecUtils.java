package fr.gagoi.pwal.utils;

public class VecUtils {

	public static Vec2D summOf(Vec2D v1, double d) {
		return new Vec2D(v1.getValue(0) + d, v1.getValue(1) + d);
	}

	public static Vec2D subOf(Vec2D v1, double d) {
		return new Vec2D(v1.getValue(0) - d, v1.getValue(1) - d);
	}

	public static Vec2D multOf(Vec2D v1, double d) {
		return new Vec2D(v1.getValue(0) * d, v1.getValue(1) * d);
	}

	public static Vec2D divOf(Vec2D v1, double d) {
		return new Vec2D(v1.getValue(0) / d, v1.getValue(1) / d);
	}

	public static Vec2D summOf(Vec2D v1, Vec2D v2) {
		return new Vec2D(v1.getValue(0) + v2.getValue(0), v1.getValue(1) + v2.getValue(1));
	}

	public static Vec2D subOf(Vec2D v1, Vec2D v2) {
		return new Vec2D(v1.getValue(0) - v2.getValue(0), v1.getValue(1) - v2.getValue(1));
	}

	public static Vec2D multOf(Vec2D v1, Vec2D v2) {
		return new Vec2D(v1.getValue(0) * v2.getValue(0), v1.getValue(1) * v2.getValue(1));
	}

	public static Vec2D divOf(Vec2D v1, Vec2D v2) {
		return new Vec2D(v1.getValue(0) / v2.getValue(0), v1.getValue(1) / v2.getValue(1));
	}

	public static Vec3D summOf(Vec3D v1, double d) {
		return new Vec3D(v1.getValue(0) + d, v1.getValue(1) + d, v1.getValue(2) + d);
	}

	public static Vec3D subOf(Vec3D v1, double d) {
		return new Vec3D(v1.getValue(0) - d, v1.getValue(1) - d, v1.getValue(2) - d);
	}

	public static Vec3D multOf(Vec3D v1, double d) {
		return new Vec3D(v1.getValue(0) * d, v1.getValue(1) * d, v1.getValue(2) * d);
	}

	public static Vec3D divOf(Vec3D v1, double d) {
		return new Vec3D(v1.getValue(0) / d, v1.getValue(1) / d, v1.getValue(2) / d);
	}

	public static Vec3D summOf(Vec3D v1, Vec3D v2) {
		return new Vec3D(v1.getValue(0) + v2.getValue(0), v1.getValue(1) + v2.getValue(1),
				v1.getValue(2) + v2.getValue(2));
	}

	public static Vec3D subOf(Vec3D v1, Vec3D v2) {
		return new Vec3D(v1.getValue(0) - v2.getValue(0), v1.getValue(1) - v2.getValue(1),
				v1.getValue(2) - v2.getValue(2));
	}

	public static Vec3D multOf(Vec3D v1, Vec3D v2) {
		return new Vec3D(v1.getValue(0) * v2.getValue(0), v1.getValue(1) * v2.getValue(1),
				v1.getValue(2) * v2.getValue(2));
	}

	public static Vec3D divOf(Vec3D v1, Vec3D v2) {
		return new Vec3D(v1.getValue(0) / v2.getValue(0), v1.getValue(1) / v2.getValue(1),
				v1.getValue(2) / v2.getValue(2));
	}
	
	public static boolean isInferior(Vec2D v1, Vec2D v2){
		return (v1.getValue(0) <= v2.getValue(0)) && (v1.getValue(1) <= v2.getValue(1));
	}
	
	public static boolean isSuperior(Vec2D v1, Vec2D v2){
		return (v1.getValue(0) >= v2.getValue(0)) && (v1.getValue(1) >= v2.getValue(1));
	}
}
