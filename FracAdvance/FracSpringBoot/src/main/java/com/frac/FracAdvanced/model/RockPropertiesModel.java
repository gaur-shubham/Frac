/**
 * 
 */
package com.frac.FracAdvanced.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ShubhamGaur
 *
 */

@Entity
@Table(name="rockProperties")
public class RockPropertiesModel {

		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY )
		private Integer id;
		
		
		private String param;
		private String value;
		private String stage;
		@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH },
				fetch=FetchType.LAZY)
		@JoinColumn(name="pId", nullable=true)
		private ProjectDetails details;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getParam() {
			return param;
		}
		public void setParam(String param) {
			this.param = param;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public ProjectDetails getDetails() {
			return details;
		}
		public void setDetails(ProjectDetails details) {
			this.details = details;
		}
		public String getStage() {
			return stage;
		}
		public void setStage(String stage) {
			this.stage = stage;
		}
		
		public RockPropertiesModel() {
			super();
		}
		@Override
		public String toString() {
			return "RockPropertiesModel [id=" + id + ", param=" + param + ", value=" + value + ", stage=" + stage
					+ ", details=" + details + "]";
		}
		public RockPropertiesModel(String param, String value, String stage, ProjectDetails details) {
			super();
			this.param = param;
			this.value = value;
			this.stage = stage;
			this.details = details;
		}
		
		
		
}
