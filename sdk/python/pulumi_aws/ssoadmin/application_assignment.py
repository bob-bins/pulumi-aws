# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApplicationAssignmentArgs', 'ApplicationAssignment']

@pulumi.input_type
class ApplicationAssignmentArgs:
    def __init__(__self__, *,
                 application_arn: pulumi.Input[str],
                 principal_id: pulumi.Input[str],
                 principal_type: pulumi.Input[str]):
        """
        The set of arguments for constructing a ApplicationAssignment resource.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
        :param pulumi.Input[str] principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        pulumi.set(__self__, "application_arn", application_arn)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "principal_type", principal_type)

    @property
    @pulumi.getter(name="applicationArn")
    def application_arn(self) -> pulumi.Input[str]:
        """
        ARN of the application.
        """
        return pulumi.get(self, "application_arn")

    @application_arn.setter
    def application_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_arn", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Input[str]:
        """
        An identifier for an object in IAM Identity Center, such as a user or group.
        """
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "principal_id", value)

    @property
    @pulumi.getter(name="principalType")
    def principal_type(self) -> pulumi.Input[str]:
        """
        Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        return pulumi.get(self, "principal_type")

    @principal_type.setter
    def principal_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "principal_type", value)


@pulumi.input_type
class _ApplicationAssignmentState:
    def __init__(__self__, *,
                 application_arn: Optional[pulumi.Input[str]] = None,
                 principal_id: Optional[pulumi.Input[str]] = None,
                 principal_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApplicationAssignment resources.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
        :param pulumi.Input[str] principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        if application_arn is not None:
            pulumi.set(__self__, "application_arn", application_arn)
        if principal_id is not None:
            pulumi.set(__self__, "principal_id", principal_id)
        if principal_type is not None:
            pulumi.set(__self__, "principal_type", principal_type)

    @property
    @pulumi.getter(name="applicationArn")
    def application_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the application.
        """
        return pulumi.get(self, "application_arn")

    @application_arn.setter
    def application_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_arn", value)

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        An identifier for an object in IAM Identity Center, such as a user or group.
        """
        return pulumi.get(self, "principal_id")

    @principal_id.setter
    def principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "principal_id", value)

    @property
    @pulumi.getter(name="principalType")
    def principal_type(self) -> Optional[pulumi.Input[str]]:
        """
        Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        return pulumi.get(self, "principal_type")

    @principal_type.setter
    def principal_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "principal_type", value)


class ApplicationAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_arn: Optional[pulumi.Input[str]] = None,
                 principal_id: Optional[pulumi.Input[str]] = None,
                 principal_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SSO Admin Application Assignment.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssoadmin.ApplicationAssignment("example",
            application_arn=aws_ssoadmin_application["example"]["application_arn"],
            principal_id=aws_identitystore_user["example"]["user_id"],
            principal_type="USER")
        ```
        ### Group Type

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssoadmin.ApplicationAssignment("example",
            application_arn=aws_ssoadmin_application["example"]["application_arn"],
            principal_id=aws_identitystore_group["example"]["group_id"],
            principal_type="GROUP")
        ```

        ## Import

        Using `pulumi import`, import SSO Admin Application Assignment using the `id`. For example:

        ```sh
         $ pulumi import aws:ssoadmin/applicationAssignment:ApplicationAssignment example arn:aws:sso::012345678901:application/id-12345678,abcd1234,USER
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
        :param pulumi.Input[str] principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SSO Admin Application Assignment.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssoadmin.ApplicationAssignment("example",
            application_arn=aws_ssoadmin_application["example"]["application_arn"],
            principal_id=aws_identitystore_user["example"]["user_id"],
            principal_type="USER")
        ```
        ### Group Type

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssoadmin.ApplicationAssignment("example",
            application_arn=aws_ssoadmin_application["example"]["application_arn"],
            principal_id=aws_identitystore_group["example"]["group_id"],
            principal_type="GROUP")
        ```

        ## Import

        Using `pulumi import`, import SSO Admin Application Assignment using the `id`. For example:

        ```sh
         $ pulumi import aws:ssoadmin/applicationAssignment:ApplicationAssignment example arn:aws:sso::012345678901:application/id-12345678,abcd1234,USER
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_arn: Optional[pulumi.Input[str]] = None,
                 principal_id: Optional[pulumi.Input[str]] = None,
                 principal_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationAssignmentArgs.__new__(ApplicationAssignmentArgs)

            if application_arn is None and not opts.urn:
                raise TypeError("Missing required property 'application_arn'")
            __props__.__dict__["application_arn"] = application_arn
            if principal_id is None and not opts.urn:
                raise TypeError("Missing required property 'principal_id'")
            __props__.__dict__["principal_id"] = principal_id
            if principal_type is None and not opts.urn:
                raise TypeError("Missing required property 'principal_type'")
            __props__.__dict__["principal_type"] = principal_type
        super(ApplicationAssignment, __self__).__init__(
            'aws:ssoadmin/applicationAssignment:ApplicationAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_arn: Optional[pulumi.Input[str]] = None,
            principal_id: Optional[pulumi.Input[str]] = None,
            principal_type: Optional[pulumi.Input[str]] = None) -> 'ApplicationAssignment':
        """
        Get an existing ApplicationAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] principal_id: An identifier for an object in IAM Identity Center, such as a user or group.
        :param pulumi.Input[str] principal_type: Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationAssignmentState.__new__(_ApplicationAssignmentState)

        __props__.__dict__["application_arn"] = application_arn
        __props__.__dict__["principal_id"] = principal_id
        __props__.__dict__["principal_type"] = principal_type
        return ApplicationAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationArn")
    def application_arn(self) -> pulumi.Output[str]:
        """
        ARN of the application.
        """
        return pulumi.get(self, "application_arn")

    @property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> pulumi.Output[str]:
        """
        An identifier for an object in IAM Identity Center, such as a user or group.
        """
        return pulumi.get(self, "principal_id")

    @property
    @pulumi.getter(name="principalType")
    def principal_type(self) -> pulumi.Output[str]:
        """
        Entity type for which the assignment will be created. Valid values are `USER` or `GROUP`.
        """
        return pulumi.get(self, "principal_type")

