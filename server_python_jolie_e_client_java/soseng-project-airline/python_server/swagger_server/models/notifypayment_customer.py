# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class NotifypaymentCustomer(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, name: str=None, email: str=None):  # noqa: E501
        """NotifypaymentCustomer - a model defined in Swagger

        :param name: The name of this NotifypaymentCustomer.  # noqa: E501
        :type name: str
        :param email: The email of this NotifypaymentCustomer.  # noqa: E501
        :type email: str
        """
        self.swagger_types = {
            'name': str,
            'email': str
        }

        self.attribute_map = {
            'name': 'name',
            'email': 'email'
        }
        self._name = name
        self._email = email

    @classmethod
    def from_dict(cls, dikt) -> 'NotifypaymentCustomer':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The notifypayment_customer of this NotifypaymentCustomer.  # noqa: E501
        :rtype: NotifypaymentCustomer
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this NotifypaymentCustomer.


        :return: The name of this NotifypaymentCustomer.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this NotifypaymentCustomer.


        :param name: The name of this NotifypaymentCustomer.
        :type name: str
        """

        self._name = name

    @property
    def email(self) -> str:
        """Gets the email of this NotifypaymentCustomer.


        :return: The email of this NotifypaymentCustomer.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this NotifypaymentCustomer.


        :param email: The email of this NotifypaymentCustomer.
        :type email: str
        """

        self._email = email
