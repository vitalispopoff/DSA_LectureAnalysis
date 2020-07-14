package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Structured {

	abstract void setBranchLeft(Structured left);

	abstract void setBranchRight(Structured right);

	abstract void setValue(int value);

	abstract int getValue();

	static Structured makeTree(Structured tree, int levels) {
		ArrayList<Structured>
				treeArray = new ArrayList<>();
		treeArray.add(tree);

		for (int i = 1; i <= 2 << levels; i++) {
			treeArray.add(i, cloneIt(tree));
		}
		for (int i = 1; i <= 2 << (levels - 1); i++) {
			Structured
					node = treeArray.get(i - 1),
					left = treeArray.get((i << 1) - 2),
					right = treeArray.get((i << 1) - 1);
			node.setBranchLeft(left);
			node.setBranchRight(right);
		}
		return tree;
	}

	static Structured cloneIt(Structured object) {
		String
				objectClassName = object.getClass().toString().substring(6);
		Class<?>
				objectClass;
		Constructor<?>
				objectClassConstructor;
		Object
				clone;

		try {
			objectClass = Class.forName(objectClassName);
			objectClassConstructor = objectClass.getConstructor();
			clone = objectClassConstructor.newInstance();
		}
		catch (Exception e) {
			e.printStackTrace();
			clone = null;
		}

		return (Structured) clone;
	}

	static void main(String[] args) {

		int levels = 3;

		BinTreeRecursiveTraversal
				tree = (BinTreeRecursiveTraversal) makeTree(new BinTreeRecursiveTraversal(), levels);
	}
}
