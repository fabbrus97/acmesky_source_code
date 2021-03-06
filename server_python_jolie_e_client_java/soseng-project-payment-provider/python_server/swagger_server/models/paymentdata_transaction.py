# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class PaymentdataTransaction(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, id: str=None, _date: str=None):  # noqa: E501
        """PaymentdataTransaction - a model defined in Swagger

        :param id: The id of this PaymentdataTransaction.  # noqa: E501
        :type id: str
        :param _date: The _date of this PaymentdataTransaction.  # noqa: E501
        :type _date: str
        """
        self.swagger_types = {
            'id': str,
            '_date': str
        }

        self.attribute_map = {
            'id': 'id',
            '_date': 'date'
        }
        self._id = id
        self.__date = _date

    @classmethod
    def from_dict(cls, dikt) -> 'PaymentdataTransaction':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The paymentdata_transaction of this PaymentdataTransaction.  # noqa: E501
        :rtype: PaymentdataTransaction
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this PaymentdataTransaction.


        :return: The id of this PaymentdataTransaction.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PaymentdataTransaction.


        :param id: The id of this PaymentdataTransaction.
        :type id: str
        """

        self._id = id

    @property
    def _date(self) -> str:
        """Gets the _date of this PaymentdataTransaction.


        :return: The _date of this PaymentdataTransaction.
        :rtype: str
        """
        return self.__date

    @_date.setter
    def _date(self, _date: str):
        """Sets the _date of this PaymentdataTransaction.


        :param _date: The _date of this PaymentdataTransaction.
        :type _date: str
        """

        self.__date = _date
