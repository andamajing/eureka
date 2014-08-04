package com.netflix.eureka.interests;

import com.netflix.eureka.registry.InstanceInfo;

/**
 * A factory to create instances of {@link Interest}.
 *
 * @author Nitesh Kant
 */
public final class Interests {

    private Interests() {
    }

    public static Interest<InstanceInfo> forVips(String... vips) {
        return new VipsInterest(vips);
    }

    public static Interest<InstanceInfo> forVip(String vip) {
        return new VipsInterest(vip);
    }

    public static Interest<InstanceInfo> forInstance(String instanceId) {
        return new InstanceInterest(instanceId);
    }

    public static Interest<InstanceInfo> forFullRegistry() {
        return FullRegistryInterest.DEFAULT_INSTANCE;
    }

}
