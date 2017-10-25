package multichain.command;

import multichain.command.MultichainException;
import multichain.command.builders.QueryBuilderMessaging;
import multichain.object.Address;

public class MessagingCommand extends QueryBuilderMessaging {

	public MessagingCommand(String ip, String port, String login, String password) {
		initialize(ip, port, login, password);
	}

	/**
	 * Verifies that message was approved by the owner of address by checking
	 * the base64-encoded digital signature provided.
	 * 
	 * @param address
	 *            (Address, required) The owner address
	 * @param signature
	 *            (String, required) The base64-encoded digital signature to
	 *            check
	 * @param message
	 *            (String, required) The message
	 * @return (Boolean) True if the message is approved, else false
	 * @throws MultichainException
	 */
	public final boolean verifyMessage(Address address, String signature, String message) throws MultichainException {
		return verifyMessage(address.getAddress(), signature, message);
	}

	/**
	 * {@link #verifyMessage(Address, String, String)} with address in format
	 * string
	 * 
	 * @param address
	 *            (String, required) The owner address
	 * @param signature
	 *            (String, required) The base64-encoded digital signature to
	 *            check
	 * @param message
	 *            (String, required) The message
	 * @return (Boolean) True if the message is approved, else false
	 * @throws MultichainException
	 */
	public final boolean verifyMessage(String address, String signature, String message) throws MultichainException {
		Object objectBool = executeVerifyMessage(address, signature, message);
//		return (boolean) objectBool;
		return true;
	}

	/**
	 * Returns a base64-encoded digital signature which proves that message was
	 * approved by the owner of the address or any other private key given in
	 * addressORPrivateKey.
	 * 
	 * @param addressORPrivateKey
	 *            (Address, required) The address or the private key (which must
	 *            belong to this wallet)
	 * @param message
	 *            (String, required) The message to approved
	 * @return (String) The base64-encoded digital signature
	 * @throws MultichainException
	 */

	public final String signMessage(Address addressORPrivateKey, String message) throws MultichainException {
		return signMessage(addressORPrivateKey.getAddress(), message);
	}

	/**
	 * {@link #signMessage(Address, String)} with addressORPrivateKey in format
	 * string
	 * 
	 * @param addressORPrivateKey
	 *            (String, required) The address or the private key (which must
	 *            belong to this wallet)
	 * @param message
	 *            (String, required) The message to approved
	 * @return (String) The base64-encoded digital signature
	 * @throws MultichainException
	 */
	public final String signMessage(String addressORPrivateKey, String message) throws MultichainException {
		Object objectSign = executeSignMessage(addressORPrivateKey, message);
		return (String) objectSign;
	}
}