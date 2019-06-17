package fr.neamar.kiss.pojo;

import fr.neamar.kiss.utils.UserHandle;

public class AppPojo extends PojoWithTags {
    public static String getComponentName(String packageName, String activityName,
                                          UserHandle userHandle) {
        return userHandle.addUserSuffixToString(packageName + "/" + activityName, '#');
    }

    public final String packageName;
    public final String activityName;
    public final UserHandle userHandle;
    public boolean excluded;
    public boolean excludedFromHistory;

    public AppPojo(String id, String packageName, String activityName, UserHandle userHandle,
                   boolean isExcluded, boolean isExcludedFromHistory) {
        super(id);

        this.packageName = packageName;
        this.activityName = activityName;
        this.userHandle = userHandle;
        this.excluded = isExcluded;
        this.excludedFromHistory = isExcludedFromHistory;
    }

    public String getComponentName() {
        return getComponentName(packageName, activityName, userHandle);
    }
}
