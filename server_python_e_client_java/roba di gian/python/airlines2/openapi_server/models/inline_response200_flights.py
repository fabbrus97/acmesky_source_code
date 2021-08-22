# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.inline_response200_price import InlineResponse200Price
from openapi_server import util

from openapi_server.models.inline_response200_price import InlineResponse200Price  # noqa: E501

class InlineResponse200Flights(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, departure_from=None, takeoff=None, destination=None, price=None, offer_code=None):  # noqa: E501
        """InlineResponse200Flights - a model defined in OpenAPI

        :param departure_from: The departure_from of this InlineResponse200Flights.  # noqa: E501
        :type departure_from: str
        :param takeoff: The takeoff of this InlineResponse200Flights.  # noqa: E501
        :type takeoff: str
        :param destination: The destination of this InlineResponse200Flights.  # noqa: E501
        :type destination: str
        :param price: The price of this InlineResponse200Flights.  # noqa: E501
        :type price: InlineResponse200Price
        :param offer_code: The offer_code of this InlineResponse200Flights.  # noqa: E501
        :type offer_code: str
        """
        self.openapi_types = {
            'departure_from': str,
            'takeoff': str,
            'destination': str,
            'price': InlineResponse200Price,
            'offer_code': str
        }

        self.attribute_map = {
            'departure_from': 'departure-from',
            'takeoff': 'takeoff',
            'destination': 'destination',
            'price': 'price',
            'offer_code': 'offer_code'
        }

        self._departure_from = departure_from
        self._takeoff = takeoff
        self._destination = destination
        self._price = price
        self._offer_code = offer_code

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200Flights':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_flights of this InlineResponse200Flights.  # noqa: E501
        :rtype: InlineResponse200Flights
        """
        return util.deserialize_model(dikt, cls)

    @property
    def departure_from(self):
        """Gets the departure_from of this InlineResponse200Flights.


        :return: The departure_from of this InlineResponse200Flights.
        :rtype: str
        """
        return self._departure_from

    @departure_from.setter
    def departure_from(self, departure_from):
        """Sets the departure_from of this InlineResponse200Flights.


        :param departure_from: The departure_from of this InlineResponse200Flights.
        :type departure_from: str
        """

        self._departure_from = departure_from

    @property
    def takeoff(self):
        """Gets the takeoff of this InlineResponse200Flights.


        :return: The takeoff of this InlineResponse200Flights.
        :rtype: str
        """
        return self._takeoff

    @takeoff.setter
    def takeoff(self, takeoff):
        """Sets the takeoff of this InlineResponse200Flights.


        :param takeoff: The takeoff of this InlineResponse200Flights.
        :type takeoff: str
        """

        self._takeoff = takeoff

    @property
    def destination(self):
        """Gets the destination of this InlineResponse200Flights.


        :return: The destination of this InlineResponse200Flights.
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """Sets the destination of this InlineResponse200Flights.


        :param destination: The destination of this InlineResponse200Flights.
        :type destination: str
        """

        self._destination = destination

    @property
    def price(self):
        """Gets the price of this InlineResponse200Flights.


        :return: The price of this InlineResponse200Flights.
        :rtype: InlineResponse200Price
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this InlineResponse200Flights.


        :param price: The price of this InlineResponse200Flights.
        :type price: InlineResponse200Price
        """

        self._price = price

    @property
    def offer_code(self):
        """Gets the offer_code of this InlineResponse200Flights.

        Codice identificativo dell'offerta  # noqa: E501

        :return: The offer_code of this InlineResponse200Flights.
        :rtype: str
        """
        return self._offer_code

    @offer_code.setter
    def offer_code(self, offer_code):
        """Sets the offer_code of this InlineResponse200Flights.

        Codice identificativo dell'offerta  # noqa: E501

        :param offer_code: The offer_code of this InlineResponse200Flights.
        :type offer_code: str
        """

        self._offer_code = offer_code
