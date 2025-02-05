/*
Membership API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package membershipclient

import (
	"encoding/json"
)

// checks if the UserAllOf type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UserAllOf{}

// UserAllOf struct for UserAllOf
type UserAllOf struct {
	// User ID
	Id string `json:"id"`
	// User role
	Role *string `json:"role,omitempty"`
}

// NewUserAllOf instantiates a new UserAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUserAllOf(id string) *UserAllOf {
	this := UserAllOf{}
	this.Id = id
	return &this
}

// NewUserAllOfWithDefaults instantiates a new UserAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserAllOfWithDefaults() *UserAllOf {
	this := UserAllOf{}
	return &this
}

// GetId returns the Id field value
func (o *UserAllOf) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *UserAllOf) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *UserAllOf) SetId(v string) {
	o.Id = v
}

// GetRole returns the Role field value if set, zero value otherwise.
func (o *UserAllOf) GetRole() string {
	if o == nil || IsNil(o.Role) {
		var ret string
		return ret
	}
	return *o.Role
}

// GetRoleOk returns a tuple with the Role field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserAllOf) GetRoleOk() (*string, bool) {
	if o == nil || IsNil(o.Role) {
		return nil, false
	}
	return o.Role, true
}

// HasRole returns a boolean if a field has been set.
func (o *UserAllOf) HasRole() bool {
	if o != nil && !IsNil(o.Role) {
		return true
	}

	return false
}

// SetRole gets a reference to the given string and assigns it to the Role field.
func (o *UserAllOf) SetRole(v string) {
	o.Role = &v
}

func (o UserAllOf) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UserAllOf) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	if !IsNil(o.Role) {
		toSerialize["role"] = o.Role
	}
	return toSerialize, nil
}

type NullableUserAllOf struct {
	value *UserAllOf
	isSet bool
}

func (v NullableUserAllOf) Get() *UserAllOf {
	return v.value
}

func (v *NullableUserAllOf) Set(val *UserAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableUserAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableUserAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserAllOf(val *UserAllOf) *NullableUserAllOf {
	return &NullableUserAllOf{value: val, isSet: true}
}

func (v NullableUserAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


