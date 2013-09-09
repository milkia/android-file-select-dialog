package org.wisterina.android.tool.dialogfragment.fileselect;

import java.io.Serializable;


/**
 * �t�@�C���I���̃��X�i�[�ł��B
 */
public interface OnFileSelectedListener extends Serializable {
	
	/**
	 * �t�@�C�����I�����ꂽ���ɌĂяo����܂��B
	 * @param path �p�X
	 */
	public abstract void onFileSelected(String path);
	/**
	 * �t�@�C���I�����L�����Z�����ꂽ�Ƃ��ɌĂяo����܂��B
	 */
	public abstract void onFileSelectCanceled();
}
