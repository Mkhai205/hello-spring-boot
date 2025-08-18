package com.kakadev.identity_service.mapper;

import com.kakadev.identity_service.dto.request.UserCreationRequest;
import com.kakadev.identity_service.dto.request.UserUpdateRequest;
import com.kakadev.identity_service.dto.response.UserResponse;
import com.kakadev.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(source = "firstName", target = "lastName")
//    @Mapping(target = "firstName", ignore = true)
    UserResponse toUserResponse(User user);
    void updateUserFromRequest(@MappingTarget User user, UserUpdateRequest request);
}
