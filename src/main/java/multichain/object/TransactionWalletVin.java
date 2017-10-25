/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.object;

/**
 * @author Ub - H. MARTEAU
 * @version 1.0
 */
public class TransactionWalletVin extends TransactionWalletVInfo{
	String txid;
	long vout;



	/**
	 * @param info
	 */
	public TransactionWalletVin(TransactionWalletVInfo info) {
		super(info);
		txid = "";
	}

	/**
	 *
	 */
	public TransactionWalletVin() {
		super();
		txid = "";
	}

	/**
	 * @return the txid
	 */
	public String getTxid() {
		return txid;
	}

	/**
	 * @param txid the txid to set
	 */
	public void setTxid(String txid) {
		this.txid = txid;
	}

	/**
	 * @return the vout
	 */
	public long getVout() {
		return vout;
	}

	/**
	 * @param vout the vout to set
	 */
	public void setVout(long vout) {
		this.vout = vout;
	}


}
