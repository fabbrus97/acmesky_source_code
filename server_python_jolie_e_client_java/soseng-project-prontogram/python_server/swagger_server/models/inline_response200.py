# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.inline_response200_data import InlineResponse200Data  # noqa: F401,E501
from swagger_server.models.inline_response200_links import InlineResponse200Links  # noqa: F401,E501
from swagger_server import util


class InlineResponse200(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, links: InlineResponse200Links=None, data: List[InlineResponse200Data]=None):  # noqa: E501
        """InlineResponse200 - a model defined in Swagger

        :param links: The links of this InlineResponse200.  # noqa: E501
        :type links: InlineResponse200Links
        :param data: The data of this InlineResponse200.  # noqa: E501
        :type data: List[InlineResponse200Data]
        """
        self.swagger_types = {
            'links': InlineResponse200Links,
            'data': List[InlineResponse200Data]
        }

        self.attribute_map = {
            'links': 'links',
            'data': 'data'
        }
        self._links = links
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200 of this InlineResponse200.  # noqa: E501
        :rtype: InlineResponse200
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> InlineResponse200Links:
        """Gets the links of this InlineResponse200.


        :return: The links of this InlineResponse200.
        :rtype: InlineResponse200Links
        """
        return self._links

    @links.setter
    def links(self, links: InlineResponse200Links):
        """Sets the links of this InlineResponse200.


        :param links: The links of this InlineResponse200.
        :type links: InlineResponse200Links
        """

        self._links = links

    @property
    def data(self) -> List[InlineResponse200Data]:
        """Gets the data of this InlineResponse200.


        :return: The data of this InlineResponse200.
        :rtype: List[InlineResponse200Data]
        """
        return self._data

    @data.setter
    def data(self, data: List[InlineResponse200Data]):
        """Sets the data of this InlineResponse200.


        :param data: The data of this InlineResponse200.
        :type data: List[InlineResponse200Data]
        """

        self._data = data
