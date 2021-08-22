# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineResponse200Distance(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, value=None, unit=None):  # noqa: E501
        """InlineResponse200Distance - a model defined in OpenAPI

        :param value: The value of this InlineResponse200Distance.  # noqa: E501
        :type value: float
        :param unit: The unit of this InlineResponse200Distance.  # noqa: E501
        :type unit: str
        """
        self.openapi_types = {
            'value': float,
            'unit': str
        }

        self.attribute_map = {
            'value': 'value',
            'unit': 'unit'
        }

        self._value = value
        self._unit = unit

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200Distance':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_distance of this InlineResponse200Distance.  # noqa: E501
        :rtype: InlineResponse200Distance
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self):
        """Gets the value of this InlineResponse200Distance.


        :return: The value of this InlineResponse200Distance.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this InlineResponse200Distance.


        :param value: The value of this InlineResponse200Distance.
        :type value: float
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def unit(self):
        """Gets the unit of this InlineResponse200Distance.


        :return: The unit of this InlineResponse200Distance.
        :rtype: str
        """
        return self._unit

    @unit.setter
    def unit(self, unit):
        """Sets the unit of this InlineResponse200Distance.


        :param unit: The unit of this InlineResponse200Distance.
        :type unit: str
        """
        if unit is None:
            raise ValueError("Invalid value for `unit`, must not be `None`")  # noqa: E501
        if unit is not None and len(unit) < 1:
            raise ValueError("Invalid value for `unit`, length must be greater than or equal to `1`")  # noqa: E501

        self._unit = unit
