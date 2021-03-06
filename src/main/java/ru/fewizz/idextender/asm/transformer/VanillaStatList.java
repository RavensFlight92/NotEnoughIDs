package ru.fewizz.idextender.asm.transformer;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import ru.fewizz.idextender.asm.AsmUtil;
import ru.fewizz.idextender.asm.Constants;
import ru.fewizz.idextender.asm.IClassNodeTransformer;

public class VanillaStatList implements IClassNodeTransformer {
	@Override
	public void transform(ClassNode cn, boolean obfuscated) {
		MethodNode method = AsmUtil.findMethod(cn, "<clinit>");
		AsmUtil.transformInlinedSizeMethod(cn, method, 4096, Constants.maxBlockId + 1, false);
	}
}
