# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.notifypayment_amount_payed import NotifypaymentAmountPayed
from openapi_server.models.notifypayment_customer import NotifypaymentCustomer
from openapi_server.models.notifypayment_transaction import NotifypaymentTransaction
from openapi_server import util

from openapi_server.models.notifypayment_amount_payed import NotifypaymentAmountPayed  # noqa: E501
from openapi_server.models.notifypayment_customer import NotifypaymentCustomer  # noqa: E501
from openapi_server.models.notifypayment_transaction import NotifypaymentTransaction  # noqa: E501

class InlineObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_code=None, customer=None, amount_payed=None, transaction=None):  # noqa: E501
        """InlineObject - a model defined in OpenAPI

        :param offer_code: The offer_code of this InlineObject.  # noqa: E501
        :type offer_code: str
        :param customer: The customer of this InlineObject.  # noqa: E501
        :type customer: NotifypaymentCustomer
        :param amount_payed: The amount_payed of this InlineObject.  # noqa: E501
        :type amount_payed: NotifypaymentAmountPayed
        :param transaction: The transaction of this InlineObject.  # noqa: E501
        :type transaction: NotifypaymentTransaction
        """
        self.openapi_types = {
            'offer_code': str,
            'customer': NotifypaymentCustomer,
            'amount_payed': NotifypaymentAmountPayed,
            'transaction': NotifypaymentTransaction
        }

        self.attribute_map = {
            'offer_code': 'offer_code',
            'customer': 'customer',
            'amount_payed': 'amount_payed',
            'transaction': 'transaction'
        }

        self._offer_code = offer_code
        self._customer = customer
        self._amount_payed = amount_payed
        self._transaction = transaction

    @classmethod
    def from_dict(cls, dikt) -> 'InlineObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_object of this InlineObject.  # noqa: E501
        :rtype: InlineObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_code(self):
        """Gets the offer_code of this InlineObject.

        Codice identificativo dell'offerta  # noqa: E501

        :return: The offer_code of this InlineObject.
        :rtype: str
        """
        return self._offer_code

    @offer_code.setter
    def offer_code(self, offer_code):
        """Sets the offer_code of this InlineObject.

        Codice identificativo dell'offerta  # noqa: E501

        :param offer_code: The offer_code of this InlineObject.
        :type offer_code: str
        """

        self._offer_code = offer_code

    @property
    def customer(self):
        """Gets the customer of this InlineObject.


        :return: The customer of this InlineObject.
        :rtype: NotifypaymentCustomer
        """
        return self._customer

    @customer.setter
    def customer(self, customer):
        """Sets the customer of this InlineObject.


        :param customer: The customer of this InlineObject.
        :type customer: NotifypaymentCustomer
        """

        self._customer = customer

    @property
    def amount_payed(self):
        """Gets the amount_payed of this InlineObject.


        :return: The amount_payed of this InlineObject.
        :rtype: NotifypaymentAmountPayed
        """
        return self._amount_payed

    @amount_payed.setter
    def amount_payed(self, amount_payed):
        """Sets the amount_payed of this InlineObject.


        :param amount_payed: The amount_payed of this InlineObject.
        :type amount_payed: NotifypaymentAmountPayed
        """

        self._amount_payed = amount_payed

    @property
    def transaction(self):
        """Gets the transaction of this InlineObject.


        :return: The transaction of this InlineObject.
        :rtype: NotifypaymentTransaction
        """
        return self._transaction

    @transaction.setter
    def transaction(self, transaction):
        """Sets the transaction of this InlineObject.


        :param transaction: The transaction of this InlineObject.
        :type transaction: NotifypaymentTransaction
        """

        self._transaction = transaction
