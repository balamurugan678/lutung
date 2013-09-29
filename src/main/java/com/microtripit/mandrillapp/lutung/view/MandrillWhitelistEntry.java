/**
 * 
 */
package com.microtripit.mandrillapp.lutung.view;

import java.util.Date;

/**
 * <p>Information about a whitelist entry.</p>
 * @author rschreijer
 *
 */
public class MandrillWhitelistEntry {
	private String email, detail;
	private Date created_at;
	
	/**
	 * @return The email that is whitelisted.
	 */
	public final String getEmail() {
		return email;
	}
	/**
	 * @return A description of why the email was whitelisted.
	 */
	public final String getDetail() {
		return detail;
	}
	/**
	 * @return When the email was added to the whitelist.
	 */
	public final Date getCreated_at() {
		return created_at;
	}

}
