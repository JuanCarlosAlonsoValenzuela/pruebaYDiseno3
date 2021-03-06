
package domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Sponsorship {

	private String		bannerUrl;
	private String		link;

	private Tutorial	tutorials;


	@URL
	@NotBlank
	public String getBannerUrl() {
		return this.bannerUrl;
	}

	public void setBannerUrl(final String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	@URL
	@NotBlank
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	@NotNull
	public Tutorial getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Tutorial tutorials) {
		this.tutorials = tutorials;
	}

}
