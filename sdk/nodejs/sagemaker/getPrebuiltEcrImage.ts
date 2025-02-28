// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get information about prebuilt Amazon SageMaker Docker images.
 *
 * > **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.sagemaker.getPrebuiltEcrImage({
 *     imageTag: "2.2-1.0.11.0",
 *     repositoryName: "sagemaker-scikit-learn",
 * });
 * ```
 */
export function getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs, opts?: pulumi.InvokeOptions): Promise<GetPrebuiltEcrImageResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:sagemaker/getPrebuiltEcrImage:getPrebuiltEcrImage", {
        "dnsSuffix": args.dnsSuffix,
        "imageTag": args.imageTag,
        "region": args.region,
        "repositoryName": args.repositoryName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrebuiltEcrImage.
 */
export interface GetPrebuiltEcrImageArgs {
    /**
     * DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
     */
    dnsSuffix?: string;
    /**
     * Image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
     */
    imageTag?: string;
    /**
     * Region to use in the registry path. If not specified, the AWS provider sets it to the current region.
     */
    region?: string;
    /**
     * Name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
     */
    repositoryName: string;
}

/**
 * A collection of values returned by getPrebuiltEcrImage.
 */
export interface GetPrebuiltEcrImageResult {
    readonly dnsSuffix?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly imageTag?: string;
    readonly region?: string;
    /**
     * Account ID containing the image. For example, `469771592824`.
     */
    readonly registryId: string;
    /**
     * Docker image URL. For example, `341280168497.dkr.ecr.ca-central-1.amazonaws.com/sagemaker-sparkml-serving:2.4`.
     */
    readonly registryPath: string;
    readonly repositoryName: string;
}
/**
 * Get information about prebuilt Amazon SageMaker Docker images.
 *
 * > **NOTE:** The AWS provider creates a validly constructed `registryPath` but does not verify that the `registryPath` corresponds to an existing image. For example, using a `registryPath` containing an `imageTag` that does not correspond to a Docker image in the ECR repository, will result in an error.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.sagemaker.getPrebuiltEcrImage({
 *     imageTag: "2.2-1.0.11.0",
 *     repositoryName: "sagemaker-scikit-learn",
 * });
 * ```
 */
export function getPrebuiltEcrImageOutput(args: GetPrebuiltEcrImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrebuiltEcrImageResult> {
    return pulumi.output(args).apply((a: any) => getPrebuiltEcrImage(a, opts))
}

/**
 * A collection of arguments for invoking getPrebuiltEcrImage.
 */
export interface GetPrebuiltEcrImageOutputArgs {
    /**
     * DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
     */
    dnsSuffix?: pulumi.Input<string>;
    /**
     * Image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
     */
    imageTag?: pulumi.Input<string>;
    /**
     * Region to use in the registry path. If not specified, the AWS provider sets it to the current region.
     */
    region?: pulumi.Input<string>;
    /**
     * Name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
     */
    repositoryName: pulumi.Input<string>;
}
