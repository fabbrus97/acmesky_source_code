# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.inline_response200_links1 import InlineResponse200Links1  # noqa: F401,E501
from swagger_server.models.inline_response200_message import InlineResponse200Message  # noqa: F401,E501
from swagger_server import util


class InlineResponse200Data(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, message: InlineResponse200Message=None, links: InlineResponse200Links1=None):  # noqa: E501
        """InlineResponse200Data - a model defined in Swagger

        :param message: The message of this InlineResponse200Data.  # noqa: E501
        :type message: InlineResponse200Message
        :param links: The links of this InlineResponse200Data.  # noqa: E501
        :type links: InlineResponse200Links1
        """
        self.swagger_types = {
            'message': InlineResponse200Message,
            'links': InlineResponse200Links1
        }

        self.attribute_map = {
            'message': 'message',
            'links': 'links'
        }
        self._message = message
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200Data':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_data of this InlineResponse200Data.  # noqa: E501
        :rtype: InlineResponse200Data
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message(self) -> InlineResponse200Message:
        """Gets the message of this InlineResponse200Data.


        :return: The message of this InlineResponse200Data.
        :rtype: InlineResponse200Message
        """
        return self._message

    @message.setter
    def message(self, message: InlineResponse200Message):
        """Sets the message of this InlineResponse200Data.


        :param message: The message of this InlineResponse200Data.
        :type message: InlineResponse200Message
        """

        self._message = message

    @property
    def links(self) -> InlineResponse200Links1:
        """Gets the links of this InlineResponse200Data.


        :return: The links of this InlineResponse200Data.
        :rtype: InlineResponse200Links1
        """
        return self._links

    @links.setter
    def links(self, links: InlineResponse200Links1):
        """Sets the links of this InlineResponse200Data.


        :param links: The links of this InlineResponse200Data.
        :type links: InlineResponse200Links1
        """

        self._links = links