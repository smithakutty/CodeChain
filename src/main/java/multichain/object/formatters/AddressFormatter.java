/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.object.formatters;

import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.internal.*;

import java.util.List;

import multichain.object.Address;

/**
 * @author Ub - H. MARTEAU
 * @version 3.0
 */
public class AddressFormatter {
	public final static Address formatAddress(Object objectAddress) {
		Address address = new Address();

		if (objectAddress != null && LinkedTreeMap.class.isInstance(objectAddress)) {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			String jsonValue = gson.toJson(objectAddress);
			address = gson.fromJson(jsonValue, Address.class);
		}

		return address;
	}

	public final static List<Address> formatAddressesList(List<Object> objectAddresses) {
		List<Address> addresses = new ArrayList<Address>();

		if (objectAddresses != null) {
			for (Object objectAddress : objectAddresses) {
				addresses.add(formatAddress(objectAddress));
			}
		}

		return addresses;
	}
}