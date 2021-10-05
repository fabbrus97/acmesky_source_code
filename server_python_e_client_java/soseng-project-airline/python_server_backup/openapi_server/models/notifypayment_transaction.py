# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class NotifypaymentTransaction(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, date=None, id=None):  # noqa: E501
        """NotifypaymentTransaction - a model defined in OpenAPI

        :param date: The date of this NotifypaymentTransaction.  # noqa: E501
        :type date: str
        :param id: The id of this NotifypaymentTransaction.  # noqa: E501
        :type id: float
        """
        self.openapi_types = {
            'date': str,
            'id': float
        }

        self.attribute_map = {
            'date': 'date',
            'id': 'id'
        }

        self._date = date
        self._id = id

    @classmethod
    def from_dict(cls, dikt) -> 'NotifypaymentTransaction':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _notifypayment_transaction of this NotifypaymentTransaction.  # noqa: E501
        :rtype: NotifypaymentTransaction
        """
        return util.deserialize_model(dikt, cls)

    @property
    def date(self):
        """Gets the date of this NotifypaymentTransaction.


        :return: The date of this NotifypaymentTransaction.
        :rtype: str
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this NotifypaymentTransaction.


        :param date: The date of this NotifypaymentTransaction.
        :type date: str
        """

        self._date = date

    @property
    def id(self):
        """Gets the id of this NotifypaymentTransaction.


        :return: The id of this NotifypaymentTransaction.
        :rtype: float
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this NotifypaymentTransaction.


        :param id: The id of this NotifypaymentTransaction.
        :type id: float
        """

        self._id = id
