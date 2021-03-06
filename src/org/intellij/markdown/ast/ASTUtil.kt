package org.intellij.markdown.ast

import org.intellij.markdown.IElementType

fun ASTNode.findChildOfType(type: IElementType): ASTNode? {
    return children.firstOrNull { it.type == type }
}

fun ASTNode.getTextInNode(allFileText: CharSequence): CharSequence {
    return allFileText.subSequence(startOffset, endOffset)
}