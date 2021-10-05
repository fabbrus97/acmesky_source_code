# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.paymentdata_expiration import PaymentdataExpiration  # noqa: F401,E501
from swagger_server.models.paymentdata_transaction import PaymentdataTransaction  # noqa: F401,E501
from swagger_server import util


class PaymentaDataBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, card_number: int=None, expiration: PaymentdataExpiration=None, cvc: int=None, circuit: str=None, transaction: PaymentdataTransaction=None):  # noqa: E501
        """PaymentaDataBody - a model defined in Swagger

        :param card_number: The card_number of this PaymentaDataBody.  # noqa: E501
        :type card_number: int
        :param expiration: The expiration of this PaymentaDataBody.  # noqa: E501
        :type expiration: PaymentdataExpiration
        :param cvc: The cvc of this PaymentaDataBody.  # noqa: E501
        :type cvc: int
        :param circuit: The circuit of this PaymentaDataBody.  # noqa: E501
        :type circuit: str
        :param transaction: The transaction of this PaymentaDataBody.  # noqa: E501
        :type transaction: PaymentdataTransaction
        """
        self.swagger_types = {
            'card_number': int,
            'expiration': PaymentdataExpiration,
            'cvc': int,
            'circuit': str,
            'transaction': PaymentdataTransaction
        }

        self.attribute_map = {
            'card_number': 'card_number',
            'expiration': 'expiration',
            'cvc': 'CVC',
            'circuit': 'circuit',
            'transaction': 'transaction'
        }
        self._card_number = card_number
        self._expiration = expiration
        self._cvc = cvc
        self._circuit = circuit
        self._transaction = transaction

    @classmethod
    def from_dict(cls, dikt) -> 'PaymentaDataBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The paymentaDataBody of this PaymentaDataBody.  # noqa: E501
        :rtype: PaymentaDataBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def card_number(self) -> int:
        """Gets the card_number of this PaymentaDataBody.


        :return: The card_number of this PaymentaDataBody.
        :rtype: int
        """
        return self._card_number

    @card_number.setter
    def card_number(self, card_number: int):
        """Sets the card_number of this PaymentaDataBody.


        :param card_number: The card_number of this PaymentaDataBody.
        :type card_number: int
        """

        self._card_number = card_number

    @property
    def expiration(self) -> PaymentdataExpiration:
        """Gets the expiration of this PaymentaDataBody.


        :return: The expiration of this PaymentaDataBody.
        :rtype: PaymentdataExpiration
        """
        return self._expiration

    @expiration.setter
    def expiration(self, expiration: PaymentdataExpiration):
        """Sets the expiration of this PaymentaDataBody.


        :param expiration: The expiration of this PaymentaDataBody.
        :type expiration: PaymentdataExpiration
        """

        self._expiration = expiration

    @property
    def cvc(self) -> int:
        """Gets the cvc of this PaymentaDataBody.


        :return: The cvc of this PaymentaDataBody.
        :rtype: int
        """
        return self._cvc

    @cvc.setter
    def cvc(self, cvc: int):
        """Sets the cvc of this PaymentaDataBody.


        :param cvc: The cvc of this PaymentaDataBody.
        :type cvc: int
        """

        self._cvc = cvc

    @property
    def circuit(self) -> str:
        """Gets the circuit of this PaymentaDataBody.


        :return: The circuit of this PaymentaDataBody.
        :rtype: str
        """
        return self._circuit

    @circuit.setter
    def circuit(self, circuit: str):
        """Sets the circuit of this PaymentaDataBody.


        :param circuit: The circuit of this PaymentaDataBody.
        :type circuit: str
        """

        self._circuit = circuit

    @property
    def transaction(self) -> PaymentdataTransaction:
        """Gets the transaction of this PaymentaDataBody.


        :return: The transaction of this PaymentaDataBody.
        :rtype: PaymentdataTransaction
        """
        return self._transaction

    @transaction.setter
    def transaction(self, transaction: PaymentdataTransaction):
        """Sets the transaction of this PaymentaDataBody.


        :param transaction: The transaction of this PaymentaDataBody.
        :type transaction: PaymentdataTransaction
        """

        self._transaction = transaction
