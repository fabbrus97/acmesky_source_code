# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.message_item import MessageItem  # noqa: F401,E501
from swagger_server import util


class MessageList(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, messages: List[MessageItem]=None):  # noqa: E501
        """MessageList - a model defined in Swagger

        :param messages: The messages of this MessageList.  # noqa: E501
        :type messages: List[MessageItem]
        """
        self.swagger_types = {
            'messages': List[MessageItem]
        }

        self.attribute_map = {
            'messages': 'messages'
        }
        self._messages = messages

    @classmethod
    def from_dict(cls, dikt) -> 'MessageList':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The message_list of this MessageList.  # noqa: E501
        :rtype: MessageList
        """
        return util.deserialize_model(dikt, cls)

    @property
    def messages(self) -> List[MessageItem]:
        """Gets the messages of this MessageList.


        :return: The messages of this MessageList.
        :rtype: List[MessageItem]
        """
        return self._messages

    @messages.setter
    def messages(self, messages: List[MessageItem]):
        """Sets the messages of this MessageList.


        :param messages: The messages of this MessageList.
        :type messages: List[MessageItem]
        """

        self._messages = messages
