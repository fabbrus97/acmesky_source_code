# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class NotifypaymentAmountPayed(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, value=None, currency=None):  # noqa: E501
        """NotifypaymentAmountPayed - a model defined in OpenAPI

        :param value: The value of this NotifypaymentAmountPayed.  # noqa: E501
        :type value: float
        :param currency: The currency of this NotifypaymentAmountPayed.  # noqa: E501
        :type currency: str
        """
        self.openapi_types = {
            'value': float,
            'currency': str
        }

        self.attribute_map = {
            'value': 'value',
            'currency': 'currency'
        }

        self._value = value
        self._currency = currency

    @classmethod
    def from_dict(cls, dikt) -> 'NotifypaymentAmountPayed':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _notifypayment_amount_payed of this NotifypaymentAmountPayed.  # noqa: E501
        :rtype: NotifypaymentAmountPayed
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self):
        """Gets the value of this NotifypaymentAmountPayed.


        :return: The value of this NotifypaymentAmountPayed.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this NotifypaymentAmountPayed.


        :param value: The value of this NotifypaymentAmountPayed.
        :type value: float
        """

        self._value = value

    @property
    def currency(self):
        """Gets the currency of this NotifypaymentAmountPayed.


        :return: The currency of this NotifypaymentAmountPayed.
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this NotifypaymentAmountPayed.


        :param currency: The currency of this NotifypaymentAmountPayed.
        :type currency: str
        """

        self._currency = currency